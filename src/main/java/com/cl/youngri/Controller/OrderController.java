package com.cl.youngri.Controller;

import com.cl.youngri.Order.Order;
import com.cl.youngri.Order.OrderForm;
import com.cl.youngri.Order.OrderService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {
        OrderService orderService;

        @GetMapping("/order")
        public String orderForm(Model model) {
            model.addAttribute("orderForm", new OrderForm());
            return "order/orderForm";
        }

        @PostMapping("/order")
        public String createOrder(@Valid OrderForm orderForm, BindingResult result, Model model) {
            if (result.hasErrors()) {
                return "order/orderForm";
            }

            Order order = orderService.createorder(orderForm);
            if (order == null) {
                String errorText = "주문을 실패하였습니다.";
                model.addAttribute("errorText", errorText);
                return "order/orderForm";
            }

            return "redirect:/";
        }
    }