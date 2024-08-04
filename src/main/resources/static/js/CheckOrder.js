const backElements=document.querySelectorAll('.image-2');

backElements.forEach(element => {
    element.addEventListener('click', () => {
        window.location.href = 'main.html';
        // 여기에 원하는 다른 동작을 추가할 수 있습니다.
    });
});