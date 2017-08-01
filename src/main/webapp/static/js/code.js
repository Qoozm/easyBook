//生产验证码
var Code = {
    flag: false,
    code: "",
    codeInit: function () {
        var codeInput = document.getElementsByClassName("code-input")[0];
        var checkCode = document.getElementsByClassName("code")[0];
        checkCode.onclick = this.createCode;
        codeInput.onblur = this.validate;
    },
    createCode: function () {
        code = "";
        var codeLength = 4; //验证码的长度
        var checkCode = document.getElementsByClassName("code")[0];
        var random = new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'); //随机数
        var spanTrue = document.getElementsByClassName("true")[0];
        spanTrue.style.display = "none";
        Code.flag = false;
        for (var i = 0; i < codeLength; i++) {
            var index = Math.floor(Math.random() * 36);
            code += random[index];
        }
        checkCode.value = code;
    },
    validate: function () {
        var inputCode = document.getElementsByClassName("code-input")[0];
        var spanTrue = document.getElementsByClassName("true")[0];
        var spanFalse = document.getElementsByClassName("false")[0];
        var inputCodeText = inputCode.value.toUpperCase();
        if (inputCodeText.length <= 0) {
            inputCode.placeholder = "请输入验证码";
            spanTrue.style.display = "none";
            spanFalse.style.display = "inline-block";
            Code.createCode();
            Code.flag = false;
        } else if (inputCodeText != code) {
            inputCode.placeholder = "验证码错误";
            inputCode.value = "";
            spanTrue.style.display = "none";
            spanFalse.style.display = "inline-block";
            Code.createCode();
            Code.flag = false;
        } else {
            spanFalse.style.display = "none";
            spanTrue.style.display = "inline-block";
            Code.flag = true;
        }
    },
}