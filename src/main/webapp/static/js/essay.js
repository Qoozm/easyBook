var Essay = {
    changeEssayDiv: function () {
        var li = document.getElementsByClassName("essay-li");
        for (var i = 0; i < li.length; i++) {
            var img = li[i].getElementsByTagName("img")[0];
            var str = Essay.cutStr(img.src);
            if (str == ("html".toLocaleUpperCase())) {
                li[i].getElementsByTagName("a")[0].style.display = "none";
                var essayDiv = li[i].getElementsByClassName("essay-div")[0];
                essayDiv.style.width = "99%";
            } else {
                console.log("bbb");
            }
        }
    },
    cutStr: function (str) {
        var arr = str.split(".");
        str = arr[arr.length - 1].toLocaleUpperCase();
        return str;
    }
};
