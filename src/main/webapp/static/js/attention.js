var attention = {
    changeVal: function () {
        var li = document.getElementsByClassName("attention-li");
        for (var i = 0; i < li.length; i++) {
            (function (n) {
                var btn = li[n].getElementsByClassName("attention-btn")[0];
                btn.onmouseover = function () {
                    btn.style.backgroundColor = "#EEEEEE";
                    btn.innerHTML = "×取消关注";
                };
                btn.onmouseout = function () {
                    btn.style.backgroundColor = "#FFFFFF";
                    btn.innerHTML = "√已关注";
                };
                btn.onclick = function () {
                    console.log("取消关注ajax");
                };
            })(i);
        }
    }
};
