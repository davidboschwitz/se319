function verify(email, phone, address){
    var num = 0;
    if(email.value != ""){
        var correct = document.createElement("img");
        correct.src = "./correct.png";
        var p = document.getElementById("email_p");
        p.appendChild(correct);
        num++;
    }
    else{
        var wrong = document.createElement("img");
        wrong.src = "./wrong.png";
        var p = document.getElementById("email_p");
        p.appendChild(wrong);
    }

    if(phone.value != ""){
        var correct = document.createElement("img");
        correct.src = "./correct.png";
        var p = document.getElementById("phone_p");
        p.appendChild(correct);
    }
    else{
        var wrong = document.createElement("img");
        wrong.src = "./wrong.png";
        var p = document.getElementById("phone_p");
        p.appendChild(wrong);
    }

    if(address.value != ""){
       var correct = document.createElement("img");
       correct.src = "./correct.png";
       var p = document.getElementById("address_p");
       p.appendChild(correct);
       localStorage.setItem("address", address.value);
       num++;
    }
    else{
       var wrong = document.createElement("img");
       wrong.src = "./wrong.png";
       var p = document.getElementById("address_p");
       p.appendChild(wrong);
    }

    return num;
}

