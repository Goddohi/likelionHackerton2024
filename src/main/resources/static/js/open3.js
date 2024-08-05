const NextElements = document.querySelectorAll('.group');

NextElements.forEach(element => {
    element.addEventListener('click', () => {
        window.location.href='open4.html';
    });
});