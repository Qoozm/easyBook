var fans = {
    attFun: function () {
        var li = document.getElementsByClassName("fans-li");
        for (var i = 0; i < li.length; i++) {
            (function (n) {
                var btn = li[n].getElementsByClassName("fans-btn")[0];
                btn.onclick = function () {
                    console.log("关注用户ajax");
                }
            })(i);
        }
    }
}
