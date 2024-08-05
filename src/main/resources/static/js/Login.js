document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const loginDetails = {
        username: document.getElementById('id').value,
        password: document.getElementById('password').value
    };

    fetch('/login', {  // 서버의 로그인 엔드포인트 URL을 맞게 설정하세요.
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(loginDetails)
    })
    .then(response => {
        if (response.ok) {
            return response.text();
        }
        throw new Error(text || 'Network response was not ok.');
    })
    .then(data => {
        alert('Login successful: ' + data);
        window.location.href = 'main.html'; // 로그인 성공 시 이동할 페이지 경로
    })
    .catch(error => {
        alert('Error: ' + error);
    });
});

const submitElements=document.querySelectorAll(".submit")



submitElements.forEach(element => {


    element.addEventListener('mouseover', () => {
        element.style.backgroundColor = '#FF6034'; // 마우스 오버 시 배경색 변경
        element.style.color = 'white'; // 텍스트 색상 변경 (옵션)
    });

    element.addEventListener('mouseout', () => {
        element.style.backgroundColor = ''; // 원래 배경색으로 되돌리기
        element.style.color = ''; // 원래 텍스트 색상으로 되돌리기 (옵션)
    });
});



const eyeElements = document.querySelectorAll('.eye');

// 원래 이미지 URL과 변경할 이미지 URL 설정
const originalImageUrl = '/src/main/resources/static/image/vector (3).png';
const newImageUrl = '/src/main/resources/static/image/vector (5).png'; // 새로운 이미지 URL
let isClicked=false;
const passwordElements = document.querySelectorAll("#password")
eyeElements.forEach(element => {
    // 초기 이미지 설정

    element.addEventListener('click', () => {
        // 현재 이미지 URL을 확인하고 토글
        if (isClicked) {
            // 원래 이미지로 변경
            element.src = originalImageUrl;
            passwordElements.forEach(element => {  
                element.type ="password";
            });
        } else {
            // 새로운 이미지로 변경
            element.src = newImageUrl;
            passwordElements.forEach(element => {  
                element.type ="text";
            });
        }
        isClicked=!isClicked;
    });
});