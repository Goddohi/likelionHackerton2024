const popupElements =document.querySelectorAll('.group');

popupElements.forEach(element => {
    element.addEventListener('click', () => {
        window.location.href='main.html';
    });
});