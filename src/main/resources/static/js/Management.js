const LeftButtonElements = document.querySelectorAll('.left-button');
const RightButtonElements = document.querySelectorAll('.right-button');
const popupElements=document.querySelectorAll('.overlap-8');
const chiliElements=document.querySelectorAll('.group-2');
LeftButtonElements.forEach(element => {
    element.addEventListener('click', () => {
        window.location.href = 'main.html';
        // 여기에 원하는 다른 동작을 추가할 수 있습니다.
    });
});

RightButtonElements.forEach(element => {
    element.addEventListener('click', () => {
        // 여기에 원하는 다른 동작을 추가할 수 있습니다.
    });
});

popupElements.forEach(element => {
    element.addEventListener('click', () => {
        window.location.href='pop-up.html';
    });
});
