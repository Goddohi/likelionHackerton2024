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