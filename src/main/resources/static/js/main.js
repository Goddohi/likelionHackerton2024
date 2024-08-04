// 모든 overlap-2 클래스를 가진 요소들을 선택
const overlapElements = document.querySelectorAll('.overlap-2');
const iconElements = document.querySelectorAll('.icon');
const imgElements = document.querySelectorAll('.img');
const inputTextElements=document.querySelectorAll(".text-input")

// 각 요소에 클릭 이벤트 리스너를 추가
overlapElements.forEach(element => {
    element.addEventListener('click', () => {
        window.location.href = 'CheckOrder.html';
        // 여기에 원하는 다른 동작을 추가할 수 있습니다.
    });
});

iconElements.forEach(element => {
    element.addEventListener('click', () => {
        // 여기에 원하는 다른 동작을 추가할 수 있습니다.
        
    });
});


imgElements.forEach(element => {
    element.addEventListener('click', () => {
        window.location.href = 'Mana.html';
        // 여기에 원하는 다른 동작을 추가할 수 있습니다.
    });
});

inputTextElements.forEach(element => {
    element.addEventListener('click', () => {
        window.location.href = 'Search.html';  // search.html 페이지로 이동
    });
});
