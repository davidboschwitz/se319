function verify(first, last, gender, state){
    var num = 0;
    if(first.value != ""){
        var correct = document.createElement("img");
        correct.src = "./correct.png";
        var p = document.getElementById("first_p");
        p.appendChild(correct);
        num++;
    }
    else{
        var wrong = document.createElement("img");
        wrong.src = "./wrong.png";
        var p = document.getElementById("first_p");
        p.appendChild(wrong);
    }

    if(last.value != ""){
        var correct = document.createElement("img");
        correct.src = "./correct.png";
        var p = document.getElementById("last_p");
        p.appendChild(correct);
        num++;
    }
    else{
        var wrong = document.createElement("img");
        wrong.src = "./wrong.png";
        var p = document.getElementById("last_p");
        p.appendChild(wrong);
    }

    if(gender.value != "Select"){
       var correct = document.createElement("img");
       correct.src = "./correct.png";
       var p = document.getElementById("gender_p");
       p.appendChild(correct);
       num++;
    }
    else{
       var wrong = document.createElement("img");
       wrong.src = "./wrong.png";
       var p = document.getElementById("gender_p");
       p.appendChild(wrong);
    }

    if(state.value != "Select"){
       var correct = document.createElement("img");
       correct.src = "./correct.png";
       var p = document.getElementById("state_p");
       p.appendChild(correct);
       num++;
    }
    else{
       var wrong = document.createElement("img");
       wrong.src = "./wrong.png";
       var p = document.getElementById("state_p");
       p.appendChild(wrong);
    }

    return num;
}

