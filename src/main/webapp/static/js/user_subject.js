var user_subject = {
    changeVal: function () {
        var li = document.getElementsByClassName("subject-li");
        for (var i = 0; i < li.length; i++) {
            (function (n) {
                var btn = li[n].getElementsByClassName("subject-btn")[0];
                btn.onmouseenter = function () {
                    btn.style.backgroundColor = "#EEEEEE"
                    btn.innerHTML = "×取消关注";
                }
                btn.onmouseleave = function () {
                    btn.style.backgroundColor = "#FFFFFF"
                    btn.innerHTML = "√已关注";
                }
                btn.onclick = function () {
                    console.log("取消关注ajax");
                }
            })(i);
        }
    }
}
