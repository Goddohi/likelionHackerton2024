const 시간 = document.getElementById("시간임");

function Time() {
const time = new Date();

시간.innerText = `${time.getHours()}:${time.getMinutes()}`
}

Time();
setInterval(Time, 1000);