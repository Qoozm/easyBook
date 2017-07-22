var nav = {
	changeNav: function () {
        var id = document.getElementById("user_name").innerHTML;	//使用session获取用户名
        var onUser = document.getElementById("onUser"),
            noUser = document.getElementById("noUser");
        if (id) {	//如果用户已经登录
            this.userEvent();
            onUser.style.display = "block";
            noUser.style.display = "none";
        } else {	//用户未登录
            onUser.style.display = "none";
            noUser.style.display = "block";
        }
    },
    userEvent: function () {
        var user = document.getElementById("userName");
        user.onmouseenter = this.showUserList;
        user.onmouseleave = this.hideUserList;
        var message = document.getElementById("message");
        message.onmouseover = this.showMessageList;
        message.onmouseout = this.hideMessageList;
    },
	//显示用户功能
	showUserList: function () {
		var userList = document.getElementById("userInfo");
	    userList.style.display = "block";
	},
	//隐藏用户功能
	hideUserList: function () {
		var userList = document.getElementById("userInfo");
	    userList.style.display = "none";
	    userList.onmouseover = function () {
	        userList.style.display = "block";
	    }
	    userList.onmouseout = function () {
	        userList.style.display = "none";
	    }
	},
	//显示消息功能
	showMessageList: function () {
		var messageList = document.getElementById("message-list");
	    messageList.style.display = "block";
	},
	//隐藏消息功能
	hideMessageList: function () {
		var messageList = document.getElementById("message-list");
	    messageList.style.display = "none";
	    messageList.onmouseover = function () {
	        messageList.style.display = "block";
	    }
	    messageList.onmouseout = function () {
	        messageList.style.display = "none";
	    }
	},
}
