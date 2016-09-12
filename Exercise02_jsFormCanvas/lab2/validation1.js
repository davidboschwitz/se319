function verify(first, last, gender, state){
    var correct = document.createElement("img");
    correct.src = "./correct.png";
    var wrong = document.createElement("img");
    wrong.src = "./wrong.png";

    if(first.value != ""){
        var p = document.getElementById("first_p");
        p.appendChild(correct);
    }
    else{
        var p = document.getElementById("first_p");
        p.appendChild(wrong);
    }

    if(last.value != ""){
        var p = document.getElementById("last_p");
        p.appendChild(correct);
    }
    else{
        var p = document.getElementById("last_p");
        p.appendChild(wrong);
    }

    if(gender.value != ""){
       var p = document.getElementById("gender_p");
       p.appendChild(correct);
    }
    else{
       var p = document.getElementById("gender_p");
       p.appendChild(wrong);
    }

    if(state.value != ""){
       var p = document.getElementById("state_p");
       p.appendChild(correct);
    }
    else{
       var p = document.getElementById("state_p");
       p.appendChild(wrong);
    }
}

