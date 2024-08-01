document.addEventListener('DOMContentLoaded', (event) => {
    const searchElements = document.querySelectorAll('.overlap');
    const deleteElements = document.querySelectorAll('.delete');
    const navigateElements = document.querySelectorAll('.navigate');

    // 검색 요소에 클릭 이벤트 리스너를 추가
    searchElements.forEach(element => {
        element.addEventListener('click', () => {
            alert('검색 이벤트가 발생했습니다!');
        });
        element.addEventListener('mouseover', () => {
            const textWrapper = element.querySelector('.text-wrapper-2');
            if (textWrapper) {
                textWrapper.style.color = 'blue';
            }
        });
        element.addEventListener('mouseout', () => {
            const textWrapper = element.querySelector('.text-wrapper-2');
            if (textWrapper) {
                textWrapper.style.color = 'white';
            }
        });
    });

    // 삭제 버튼에 클릭 및 마우스 이벤트 리스너를 추가
    deleteElements.forEach(button => {
        button.addEventListener('click', (event) => {
            event.stopPropagation(); // 이벤트 전파 중단
            alert('삭제 이벤트가 발생했습니다!');
        });

        button.addEventListener('mouseover', () => {
            button.style.color = 'red'; // 삭제 버튼 색상 변경
        });

        button.addEventListener('mouseout', () => {
            button.style.color = 'white'; // 삭제 버튼 색상 변경
        });
    });

    // navigateElements에 클릭 이벤트 리스너를 추가
    navigateElements.forEach(element => {
        element.addEventListener('click', () => {
            const targetPage = element.getAttribute('data-target');
            window.location.href = targetPage;
        });
    });
});