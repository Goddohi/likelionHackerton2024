
const backElements=document.querySelectorAll('#주문현황');

backElements.forEach(element => {
    element.addEventListener('click', () => {
        window.location.href = 'Mana.html';
        // 여기에 원하는 다른 동작을 추가할 수 있습니다.
    });
});