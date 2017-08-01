<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: colin
  Date: 2017/7/17
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>

    <link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap-combined.no-icons.min.css"
          rel="stylesheet">
    <link href="http://netdna.bootstrapcdn.com/font-awesome/3.0.2/css/font-awesome.css" rel="stylesheet">

    <link rel="stylesheet" href="../../static/css/public.css"/>
    <style type="text/css">
        body {
            margin: 0px;
            overflow: hidden;
            height: 648px;
        }

        li {
            list-style: none;
        }

        a {

        }

        #container {
            height: 100%;
            width: 100%;
        }

        #container > .left {
            float: left;
            height: 100%;
            width: 18%;
            background-color: #3F3F3F;
        }

        #container > .left > a {
            display: inline-block;
            height: 50px;
            width: 80%;
            border: #EC6149 solid 1px;
            border-radius: 5px;
            text-align: center;
            line-height: 50px;
            color: #EA6F5A;
            font-size: 22px;
            text-decoration: none;
            margin: 10%;
        }

        #container > .left > a:hover {
            border: #FF2222 solid 1px;
            color: #FF2222;
        }

        #container > .left * {
            margin-left: 10%;
            margin-bottom: 5px;
        }

        #container > .left button {
            background-color: inherit;
            border: 0px;
            outline: none;
        }

        #container > .left > #add-anthology {
            color: #FFFFFF;
            font-size: 15px;
        }

        #container > .left > .anthology-ul {
            margin-left: 0px;
        }

        #container > .left > .anthology-ul > li {
            height: 40px;
            margin: 0px;
            color: #FFFFFF;
            padding-left: 10%;
            line-height: 40px;
            font-size: 18px;
            border-left: #3F3F3F solid 3px;
            cursor: pointer;
        }

        #container > .left > .anthology-ul > li:hover {
            border-left: #EA6F5A solid 3px;
            background-color: #646464;
        }

        #container > .left > .anthology-ul > .active {
            border-left: #EA6F5A solid 3px;
            background-color: #646464;
        }

        #container > .left > #trash {
            height: 20px;
            width: 75px;
            font-size: 15px;
            color: #272636;
        }

        #container > .left > #trash > img {
            height: 20px;
            margin: 0px;
            margin-bottom: 5px;
        }

        #container > .center {
            display: inline-block;
            height: 100%;
            width: 19.5%;
            background-color: #FFFFFF;
            border-right: #D9D9D9 solid 1px;
        }

        #container > .center > button {
            background-color: #FFFFFF;
            border: 0px;
            outline: none;
            font-size: 15px;
            color: #AAAAAA;
            margin: 10px 23px;
        }

        #container > .center > button:hover {
            color: #777777;
        }

        #container > .center > .essay-item {
            width: 100%;
            margin: 0px;
        }

        #container > .center > .essay-item > li {
            border-left: #FFFFFF solid 3px;
            padding-left: 20px;
            height: 40px;
            font-size: 20px;
            line-height: 40px;
            font-weight: 500;
        }

        #container > .center > .essay-item > .active {
            border-left: #EA6F5A solid 3px;
            background-color: #ECECEC;
        }

        #container > .center > .essay-item > li:hover {
            border-left: #EA6F5A solid 3px;
            background-color: #ECECEC;
        }

        #container > .center > .essay-item > li > button {
            background-color: initial;
            border: 0px;
            outline: none;
            margin-bottom: 5px;
            margin-left: 40%;
            display: none;
        }

        #container > .center > .essay-item > li > button > img {
            height: 15px;
        }

        #container > .right {
            float: right;
            height: 100%;
            width: 62%;
            background-color: #FFFFFF;
        }

        #container > .right > .hero-unit {
            background-color: initial;
            display: block;
            margin-top: -50px;
            margin-left: -60px;
        }

        #container > .right > .hero-unit > .h {
            width: 300px;
            height: 30px;
            border: #BBBBBB solid 1px;
            border-radius: 5px;
            outline: none;
            font-size: 20px;
            padding: 0px 10px;
            line-height: 30px;
        }

        #container > .right > .hero-unit > .h:focus {
            border: #777777 solid 1px;
        }

        #container > .right > .hero-unit > .send-btn {
            position: absolute;
            right: 20px;
            height: 30px;
            width: 50px;
            font-size: 18px;
            line-height: 30px;
            outline: none;
            border: 0px;
            background-color: #CCCCCC;
            border-radius: 5px;
        }

        #container > .right > .hero-unit > .btn-toolbar {
            width: 105%;
        }

        #editor {
            height: 520px;
            width: 105%;
            background-color: white;
            border-collapse: separate;
            border: 1px solid rgb(204, 204, 204);
            padding: 4px;
            box-sizing: content-box;
            -webkit-box-shadow: rgba(0, 0, 0, 0.0745098) 0px 1px 1px 0px inset;
            box-shadow: rgba(0, 0, 0, 0.0745098) 0px 1px 1px 0px inset;
            border-top-right-radius: 3px;
            border-bottom-right-radius: 3px;
            border-bottom-left-radius: 3px;
            border-top-left-radius: 3px;
            overflow-y: scroll;
            outline: none;
        }

        #voiceBtn {
            width: 20px;
            color: transparent;
            background-color: transparent;
            transform: scale(2.0, 2.0);
            -webkit-transform: scale(2.0, 2.0);
            -moz-transform: scale(2.0, 2.0);
            border: transparent;
            cursor: pointer;
            box-shadow: none;
            -webkit-box-shadow: none;
        }

        div[data-role="editor-toolbar"] {
            -webkit-user-select: none;
            -moz-user-select: none;
            -ms-user-select: none;
            user-select: none;
        }

        .dropdown-menu a {
            cursor: pointer;
        }

    </style>

</head>
<body>

<div id="container">
    <div class="left">
        <a href="<c:url value="/" />">返回首页</a>
        <button id="add-anthology">+新建专题</button>
        <ul class="anthology-ul">
            <!--获取当前用户自己创建的专题-->
            <li>日记本</li>
            <li>日记本</li>
            <li>日记本</li>
        </ul>
        <button id="trash"><img src="../../static/img/icon/trash.png"/>回收站</button>
    </div>
    <div class="center">
        <button id="newEssay">+新建文章</button>
        <ul class="essay-item">
            <!--获取当前专题中的文章-->
            <li>
                <span>无标题文章</span>
                <button><img src="../../static/img/icon/trash.png"/></button>
            </li>
            <li>
                <span>无标题文章</span>
                <button><img src="../../static/img/icon/trash.png"/></button>
            </li>
            <li>
                <span>无标题文章</span>
                <button><img src="../../static/img/icon/trash.png"/></button>
            </li>
            <li>
                <span>无标题文章</span>
                <button><img src="../../static/img/icon/trash.png"/></button>
            </li>
        </ul>
    </div>
    <div class="right">

        <div style="visibility: hidden;" class="hero-unit">
            <input class="h" value="" placeholder="标题"/>
            <input class="send-btn" type="button" value="发布"/>
            <div class="btn-toolbar" data-role="editor-toolbar" data-target="#editor">
                <div class="btn-group">
                    <a class="btn dropdown-toggle" data-toggle="dropdown" title="Font"><i class="icon-font"></i><b
                            class="caret"></b></a>
                    <ul class="dropdown-menu">
                    </ul>
                </div>
                <div class="btn-group">
                    <a class="btn dropdown-toggle" data-toggle="dropdown" title="Font Size"><i
                            class="icon-text-height"></i>&nbsp;<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a data-edit="fontSize 5"><font size="5">Huge</font></a></li>
                        <li><a data-edit="fontSize 3"><font size="3">Normal</font></a></li>
                        <li><a data-edit="fontSize 1"><font size="1">Small</font></a></li>
                    </ul>
                </div>
                <div class="btn-group">
                    <a class="btn" data-edit="bold" title="Bold (Ctrl/Cmd+B)"><i class="icon-bold"></i></a>
                    <a class="btn" data-edit="italic" title="Italic (Ctrl/Cmd+I)"><i class="icon-italic"></i></a>
                    <a class="btn" data-edit="strikethrough" title="Strikethrough"><i
                            class="icon-strikethrough"></i></a>
                    <a class="btn" data-edit="underline" title="Underline (Ctrl/Cmd+U)"><i
                            class="icon-underline"></i></a>
                </div>
                <div class="btn-group">
                    <!--<a class="btn" data-edit="insertunorderedlist" title="Bullet list"><i class="icon-list-ul"></i></a>
                    <a class="btn" data-edit="insertorderedlist" title="Number list"><i class="icon-list-ol"></i></a>-->
                    <a class="btn" data-edit="outdent" title="Reduce indent (Shift+Tab)"><i
                            class="icon-indent-left"></i></a>
                    <a class="btn" data-edit="indent" title="Indent (Tab)"><i class="icon-indent-right"></i></a>
                </div>
                <div class="btn-group">
                    <a class="btn" data-edit="justifyleft" title="Align Left (Ctrl/Cmd+L)"><i
                            class="icon-align-left"></i></a>
                    <a class="btn" data-edit="justifycenter" title="Center (Ctrl/Cmd+E)"><i
                            class="icon-align-center"></i></a>
                    <a class="btn" data-edit="justifyright" title="Align Right (Ctrl/Cmd+R)"><i
                            class="icon-align-right"></i></a>
                    <a class="btn" data-edit="justifyfull" title="Justify (Ctrl/Cmd+J)"><i
                            class="icon-align-justify"></i></a>
                </div>
                <div class="btn-group">
                    <a class="btn dropdown-toggle" data-toggle="dropdown" title="Hyperlink"><i
                            class="icon-link"></i></a>
                    <div class="dropdown-menu input-append">
                        <input class="span2" placeholder="URL" type="text" data-edit="createLink"/>
                        <button class="btn" type="button">Add</button>
                    </div>
                    <a class="btn" data-edit="unlink" title="Remove Hyperlink"><i class="icon-cut"></i></a>
                </div>
                <div class="btn-group">
                    <a class="btn" title="Insert picture (or just drag & drop)" id="pictureBtn"><i
                            class="icon-picture"></i></a>
                    <input type="file" data-role="magic-overlay" data-target="#pictureBtn" data-edit="insertImage"/>
                </div>
                <div class="btn-group">
                    <a class="btn" data-edit="undo" title="Undo (Ctrl/Cmd+Z)"><i class="icon-undo"></i></a>
                    <a class="btn" data-edit="redo" title="Redo (Ctrl/Cmd+Y)"><i class="icon-repeat"></i></a>
                </div>
                <input type="text" data-edit="inserttext" id="voiceBtn" x-webkit-speech="">
            </div>
            <div id="editor">

            </div>
        </div>

    </div>
</div>

<script src="../../static/js/jquery-3.1.0.min.js"></script>
<script src="../../static/essayEdit/js/bootstrap.min.js"></script>
<script src="../../static/essayEdit/external/google-code-prettify/prettify.js"></script>
<script src="../../static/essayEdit/external/jquery.hotkeys.js"></script>
<script src="../../static/essayEdit/bootstrap-wysiwyg.js"></script>
<script>
    function init() {
        setHeight();	//设置高度
        getAnthology();	//获取专题

        creatEssayEvent();      //创建文章
    }

    //设置高度
    function setHeight() {
        var h = window.innerHeight;
        console.log(h);
        document.body.style.height = h + "px";
    }

    //获取文集
    function getAnthology() {
        $.ajax({
            type: "get",
            url: "/editEssay/acquireUserAnthology?user_id=${user.user_id}",		//使用get请求参数在url后demo_get?user_id=user_id
            async: true,
            success: function (data) {
                if (data) {
                    var ul = document.getElementsByClassName("anthology-ul")[0];
                    ul.innerHTML = "";
                    for (var i = 0; i < data.length; i++) {
                        var li = document.createElement("li");
                        li.index = data[i].anthology_id;	//获取专题的id
                        li.innerHTML = data[i].anthology_name;	//获取到专题的名字
                        ul.appendChild(li);
                    }
                    anthologyEvent(ul);	//点击专题事件
                }
            },
            error: function (err) {
                console.log("error:" + err.message);
            }
        });
    }

    //获取文集中相应的文章
    function getEssay(anthology_id) {
        $.ajax({
            type: "get",
            url: "/editEssay/acquireAnthologyEssayInfo?essay_anthology_id=" + anthology_id,
            async: true,
            success: function (data) {
                console.log(data);
                /*
                if(data){
                    var hero_unit = document.getElementsByClassName("hero-unit")[0];
                    hero_unit.style.visibility = "hidden";
                    var ul = document.getElementsByClassName("essay-item")[0];

                    for(var i=0; i<data.length; i++){
                        var li = document.createElement("li");
                        var span = document.createElement("span");
                        span.innerHTML = date[i];	//标题
                        var img = document.createElement("img");
                        li.appendChild(span);
                        li.appendChild(img);
                        ul.appendChild(li);
                    }
                    essayEvent(ul);	//点击文章事件
                }
                */
            },
            error: function (err) {
                console.log("err:" + err.message);
            }
        })
    }

    //获取文章内容
    function showEditor(essay_id) {
        $.ajax({
            type: "get",
            url: "/editEssay/acquireEssayContent?essay_id=" + essay_id,
            async: true,
            success: function (data) {
                console.log(data);
                /*
                if (data) {
                    var hero_unit = document.getElementsByClassName("hero-unit")[0];
                    hero_unit.style.visibility = "visible";
					var editor = hero_unit.getElementById("editor");
					editor.innerHTML = data;
                    console.log(data);
                }
                */
            },
            error: function (err) {
                console.log("err:" + err.message);
            }
        });
    }

    //发布文章
    function release(category_essay_id) {
        var btn = document.getElementsByClassName("send-btn")[0];
        btn.onclick = function () {
            var ant_ul = document.getElementsByClassName("anthology-ul")[0];
            var category_essay_id = ant_ul.getElementsByClassName("active")[0].index;

            var editor = document.getElementById("editor");
            var essay_title = document.getElementsByClassName("h")[0];
            var essay_user_id = "${user.user_id}";
            var essay_photo = editor.getElementsByTagName("img")[0];
            var essay_content = editor.innerHTML;
            var time = new Date();
            var essay_pubDate = time;
            var essay_category_id = document.getElementsByClassName("active")[0].index;
            $.ajax({
                type: "post",
                url: "/editEssay/publishEssay",
                async: true,
                dataType: 'json',
                contentType: 'application/json',
                data: JSON.stringify({
                    essay_title: essay_title, essay_user_id: essay_user_id, essay_content: essay_content,
                    essay_pubDate: essay_pubDate, essay_category_id: essay_category_id
                }),
                success: function (data) {
                    console.log(data);
                },
                error: function (err) {
                    console.log("err:" + err.message);
                }
            });
        }
    }

    //专题点击事件
    function anthologyEvent(ul) {
        var li = ul.getElementsByTagName("li");
        for (var i = 0; i < li.length; i++) {
            (function (n) {
                li[n].onclick = function () {
                    //显示专题中的文章
                    console.log(li[n].index);
                    getEssay(li[n].index);
                    creatEssayEvent();
                    release();		//发布
                    //实现点击样式变化
                    var li_off = ul.getElementsByClassName("active")[0];	//原active
                    if (li_off) {
                        li_off.classList.remove("active");
                    }
                    li[n].className = "active";
                }
            })(i);
        }
    }

    //点击文章事件
    function essayEvent(ul) {
        var li = ul.getElementsByTagName("li");
        for (var i = 0; i < li.length; i++) {
            (function (n) {
                li[n].onclick = function () {
                    var essay_id = li[n].getElementsByTagName("span")[0].index;
                    var ant_ul = document.getElementsByClassName("anthology-ul")[0];
                    var category_essay_id = ant_ul.getElementsByClassName("active")[0].index;
                    showEditor(essay_id);

                    //实现点击样式变化
                    var li_off = ul.getElementsByClassName("active")[0];	//原active
                    if (li_off) {
                        var trash_off = li_off.getElementsByTagName("button")[0];
                        if (trash_off) {
                            trash_off.style.display = "none";
                        }
                        li_off.classList.remove("active");
                    }
                    li[n].className = "active";
                    var trash = li[n].getElementsByTagName("button")[0];
                    if (trash) {
                        trash.style.display = "inline-block";
                    }
                }
            })(i);
        }
    }

    //新建文章
    function creatEssayEvent() {
        var btn = document.getElementById("newEssay");
        btn.onclick = function () {
            var hero_unit = document.getElementsByClassName("hero-unit")[0];
            hero_unit.style.visibility = "visible";
        }
    }

    init();
    //编辑器
    $(function () {
        function initToolbarBootstrapBindings() {
            var fonts = ['Serif', 'Sans', 'Arial', 'Arial Black', 'Courier',
                    'Courier New', 'Comic Sans MS', 'Helvetica', 'Impact', 'Lucida Grande', 'Lucida Sans', 'Tahoma', 'Times',
                    'Times New Roman', 'Verdana'],
                fontTarget = $('[title=Font]').siblings('.dropdown-menu');
            $.each(fonts, function (idx, fontName) {
                fontTarget.append($('<li><a data-edit="fontName ' + fontName + '" style="font-family:\'' + fontName + '\'">' + fontName + '</a></li>'));
            });
            $('a[title]').tooltip({container: 'body'});
            $('.dropdown-menu input').click(function () {
                return false;
            })
                .change(function () {
                    $(this)
                        .parent('.dropdown-menu')
                        .siblings('.dropdown-toggle')
                        .dropdown('toggle');
                })
                .keydown('esc', function () {
                    this.value = '';
                    $(this).change();
                });
            $('[data-role=magic-overlay]').each(function () {
                var overlay = $(this), target = $(overlay.data('target'));
                overlay.css('opacity', 0).css('position', 'absolute').offset(target.offset()).width(target.outerWidth()).height(target.outerHeight());
            });
            if ("onwebkitspeechchange" in document.createElement("input")) {
                var editorOffset = $('#editor').offset();
                $('#voiceBtn').css('position', 'absolute').offset({
                    top: editorOffset.top,
                    left: editorOffset.left + $('#editor').innerWidth() - 35
                });
            } else {
                $('#voiceBtn').hide();
            }
        }

        function showErrorAlert(reason, detail) {
            var msg = '';
            if (reason === 'unsupported-file-type') {
                msg = "Unsupported format " + detail;
            }
            else {
                console.log("error uploading file", reason, detail);
            }
            $('<div class="alert"> <button type="button" class="close" data-dismiss="alert">&times;</button>' +
                '<strong>File upload error</strong> ' + msg + ' </div>').prependTo('#alerts');
        }

        initToolbarBootstrapBindings();
        $('#editor').wysiwyg({fileUploadError: showErrorAlert});
        window.prettyPrint && prettyPrint();
    });
</script>
</body>
</html>
