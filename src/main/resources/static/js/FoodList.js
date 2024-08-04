const backElements=document.querySelectorAll('.image');

backElements.forEach(element => {
    element.addEventListener('click', () => {
        window.location.href = 'StoreList.html';
        // 여기에 원하는 다른 동작을 추가할 수 있습니다.
    });
});