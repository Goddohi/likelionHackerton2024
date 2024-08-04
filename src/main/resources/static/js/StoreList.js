const saladyElements=document.querySelectorAll('.element-4');

const backElements=document.querySelectorAll('.image-5 ');
saladyElements.forEach(element => {
    element.addEventListener('click', () => {
        window.location.href='FoodList.html';
    });
});

backElements.forEach(element => {
    element.addEventListener('click', () => {
        window.location.href='Search.html';
    });
});