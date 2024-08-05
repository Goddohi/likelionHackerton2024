const NextElements = document.querySelectorAll('.next');

NextElements.forEach(element => {
    element.addEventListener('click', () => {
        window.location.href='Login.html';
    });
});