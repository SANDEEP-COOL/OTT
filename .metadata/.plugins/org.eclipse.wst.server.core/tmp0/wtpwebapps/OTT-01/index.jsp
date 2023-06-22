<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
	<script src="https://kit.fontawesome.com/05d425af79.js" crossorigin="anonymous"></script>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11.1.6/dist/sweetalert2.all.min.js"></script>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/sweetalert2@11.1.6/dist/sweetalert2.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Comfortaa:wght@700&display=swap" rel="stylesheet">
    <!-- <script src="index.js"></script> -->
	<style>
	body {
      margin: 0;
      padding: 0;
      background-color: pink;
      background-image: url('https://wallpaperaccess.com/full/2529012.jpg');
      background-repeat: no-repeat;
      background-size: cover;
    }
    .display-none {
      opacity: 0;
      transition: opacity 2.5s;
    }
    .display-block {
      opacity: 1;
      transition: opacity 2.5s;
    }
    .white-placeholder::placeholder {
        color: white;
    }
    .shadow{
        box-shadow: rgba(50, 50, 93, 0.25) 0px 50px 100px -20px, rgba(0, 0, 0, 0.3) 0px 30px 60px -30px;
    }
	</style>
</head>
<body>

	<!-- div for creating Login and sinhup buttons...  -->
	<div class="d-flex justify-content-end align-items-center" style="position: relative; top: 60px">
		<button type="button" class="btn btn-outline-light mx-5" onclick="openLoginForm()" id="login_button">Login</button>
		<button type="button" class="btn btn-outline-light mx-5" id="signupButton" onclick="opensignupForm()">Signup</button>
	</div>
	<!-- div for creating Login and sinhup buttons...  -->


	<!-- SIDEBAR -->
	<div class="d-flex justify-content-center align-items-center" style="height: 100vh; width: 12vw">
    <div class="d-flex flex-column justify-content-center align-items-center">
      <i class="fa-solid fa-user p-4 sideBarIcon"></i>
      <i class="fa-solid fa-magnifying-glass p-4 sideBarIcon"></i>
      <i class="fa-solid fa-house p-4 sideBarIcon"></i>
      <i class="fa-solid fa-tv p-4 sideBarIcon"></i>
      <i class="fa-solid fa-clapperboard p-4 sideBarIcon"></i>
      <i class="fa-solid fa-volleyball p-4 sideBarIcon"></i>
    </div>
    <div class="d-flex flex-column justify-content-around display-none" style="height: 384px" id="sideBar">
	      <strong>MySpace</strong>
	      <strong>Search</strong>
	      <strong>Home</strong>
	      <strong>Tv</strong>
	      <strong>Movies</strong>
	      <strong>Sport</strong>
	    </div>
	</div>
	<!-- SIDEBAR -->
</body>

<script>

// Get all sidebar icons
const sideBarIcons = document.querySelectorAll(".sideBarIcon");
const sideBar = document.getElementById("sideBar");
let container;

// Add event listeners to each icon
sideBarIcons.forEach(icon => {
icon.addEventListener("mouseover", function() {
    sideBar.classList.remove("display-none");
    sideBar.classList.add("display-block");
});

icon.addEventListener("mouseout", function() {
    sideBar.classList.remove("display-block");
    sideBar.classList.add("display-none");
});
});

//create a div of full viewPort size...
function createFullViewPortSizedContainerForLoginAndSignupFor(){
	container = document.createElement("div");
    container.classList.add("d-flex", "align-items-center", "justify-content-center", "flex-column");
    container.style.position = "absolute";
    container.style.top = "0";
    container.style.width = "100vw";
    container.style.height = "100vh";
}
//create a div of full viewPort size...

/*open signup form after clicking on signupButton...*/
function opensignupForm(){
    // create a div of full viewPort size...
    createFullViewPortSizedContainerForLoginAndSignupFor();
    
    // crete a form... 
    let form = document.createElement("form");
    form.classList.add("p-4", "rounded", "shadow");
    form.style.backgroundColor = "rgb(255,255,255)";
    form.style.height = "80vh";
    form.style.width = "28vw";


    let heading = document.createElement("h3");
    heading.textContent = "SIGNUP";
    heading.classList.add("text-dark", "text-center", "mb-4");
    heading.style.fontWeight = "800";
    form.appendChild(heading);
 	// crete a form... 
    
    for(let i = 0 ; i < 5 ; i++) {

        // label ...
        let label = document.createElement("label");
        label.setAttribute("for", "formGroupExampleInput");
        label.classList.add("form-label");
        label.style.marginLeft = "13px";
        label.style.fontFamily = 'Comfortaa', 'cursive';
        label.style.fontSize = "12px";
        if(i === 0){
            label.textContent = "Email";
        }
        else if(i === 1){
            label.textContent = "Contact number";
        }
        else if(i === 2){
            label.textContent = "Username";
        }
        else if(i === 3){
            label.textContent = "Password";
        }
        else if(i === 4){
            label.textContent = "Confirm Password";
        }
        // label ...

        // input tag ...
        let input = document.createElement("input");
        input.setAttribute("type", "text");
        input.classList.add("form-control", "border-bottom", "border-0", "mb-4");
        input.id = "formGroupExampleInput";
        input.style.borderBottomWidth = "4px";
        input.style.fontSize = "13px";
        input.style.fontFamily = 'Comfortaa', 'cursive';
        // <i class="fa-solid fa-user p-4 sideBarIcon"></i>
        // input tag ...
        
        let icon;

        if (i === 0) {
        	
            // icon 
            icon = document.createElement("i");
            icon.classList.add("fas", "fa-user", "p-4");
            input.appendChild(icon);
            input.placeholder = "Type email id";
            input.id = "email";
            input.name = "email";
            // icon 
            
        } else if (i === 1) {
        	
            input.placeholder = "Type contact number";
            input.id = "contact";
            input.setAttribute("maxlength", "10");
            input.name = "contact";
            
        }
        else if (i === 2) {
        	
            input.placeholder = "Type username";
            input.id = "username";
            input.name = "username";
            
        }
        else if (i === 3) {
        	
            input.placeholder = "Type Password";
            input.id = "password";
            input.setAttribute("maxlength", "10");
            input.name = "password";
            
        }
        else if(i === 4){
        	
            input.placeholder = "Confirm Password";
            input.id = "confirm_password";
            
        }

       
        /* append form element */
        form.appendChild(label);
        form.appendChild(input);
        /* append form element */
        
    }

    
    // login button inside sinup form 
    let signupButton = document.createElement("button");
    signupButton.classList.add("btn", "btn-outline-primary");
    signupButton.style.width = "97%";
    signupButton.textContent = "SIGNUP";
    signupButton.id = "signup_button";
    form.appendChild(signupButton);
    container.appendChild(form);
    document.body.appendChild(container);
    
    /* click event on signup button - validate all input fields... */
    signupButton.addEventListener('click', function(event) {
    	
        event.preventDefault(); // Prevent the default form submission
        
        let ans = validateInputFields();
        if(ans == true){
        	console.log("yes");
        	
			/* submit - signup form */
			
			let user = send_User_Signup_Info();
			sendAjaxRequest('user_signup', 'post', 'json', user);
			form.remove();
			container.remove();
			/* submit - signup form */
        	
        }
        else
        	console.log("NO");
        
      });
    /* click event on signup button - validate all input fields... */

 	// login button inside sinup form
 	

}
/*open signup form after clicking on signupButton...*/


/* open loginForm... */
function openLoginForm(){
	
	// create a div of full viewPort size...
    createFullViewPortSizedContainerForLoginAndSignupFor();
	
	/* create login form... */
	let form = document.createElement("form");
    form.classList.add("p-4", "rounded", "shadow");
    form.style.backgroundColor = "rgb(255,255,255)";
    form.style.height = "57vh";
    form.style.width = "25vw";
    /* create login form... */
    
    /* create heading of login form... */
    let heading = document.createElement("h3");
 	let icon = document.createElement("i");
 	icon.classList.add("fa-solid", "fa-right-to-bracket");
 	icon.style.marginRight = "10px";
 	heading.innerHTML = "LOGIN";
 	heading.prepend(icon);
    
    heading.classList.add("text-dark", "text-center", "mb-5");
    heading.style.fontWeight = "800";
    form.appendChild(heading);
    /* create heading of login form... */
    
    for(let i = 0 ; i < 2 ; i++){
    	
    	/* label... */
    	let label = document.createElement("label");
        label.classList.add("form-label");
        label.style.marginLeft = "13px";
        label.style.fontFamily = 'Comfortaa', 'cursive';
        label.style.fontSize = "12px";
    	/* label... */
    	
    	 // input tag ...
        let input = document.createElement("input");
        input.setAttribute("type", "text");
        input.classList.add("form-control", "border-bottom", "border-0", "mb-5");
        input.style.borderBottomWidth = "4px";
        input.style.fontSize = "13px";
        input.style.fontFamily = 'Comfortaa', 'cursive';
     	// input tag ...
     
    	if(i == 0){
    		
            input.id = "username";
            label.setAttribute("for", "username");
			label.innerHTML = 'Username';
			input.placeholder = "Type username";
            
    	}
    	else if(i == 1){
    		
    		input.id = "password";
            label.setAttribute("for", "password");
 			label.innerHTML = 'Password'
 			input.placeholder = "Type password";
 			input.setAttribute("maxLength", "10");
 			
    	}
    	
     	/* form me label and input ele insert kar do... */
    	form.appendChild(label);
    	form.appendChild(input);
    	/* form me label and input ele insert kar do... */
    	
    }
    
    /* create Login button... */
    let loginButton = document.createElement("button");
    loginButton.classList.add("btn", "btn-outline-primary");
    loginButton.style.width = "97%";
    loginButton.textContent = "LOGIN";
    loginButton.id = "login_button";
    form.appendChild(loginButton);
    /* create Login button... */
    
    
    container.appendChild(form);
    document.body.appendChild(container);
    
    /* agar user login button par click karta hai to... */
    
    loginButton.addEventListener('click', function(event){
    	
    	 event.preventDefault(); 
    	 let user = send_User_Login_Info();
    	 sendAjaxRequest('user_login', 'post', 'json', user);
    	
    	
    });
   
    
    /* agar user login button par click karta hai to... */
	
}
/* open loginForm... */

/* get object - user - info at Signup */
function send_User_Signup_Info(){
	let user = {
		email : document.getElementById("email").value,
		contact : document.getElementById("contact").value,
		username : document.getElementById("username").value,
		password : document.getElementById("password").value
	};
	return user;
}
/* get object - user - info at Signup */


/* get object - user - info at login */
function send_User_Login_Info(){
	let user = {
		username : document.getElementById("username").value,
		password : document.getElementById("password").value
	};
	return user;
}
/* get object - user - info at login */

function validateInputFields(){
	
	console.log(validateEmailId(), validateContactNumber(), validatePassword(), matchConfPassword());
	if(validateEmailId() == true && validateContactNumber() == true && validatePassword() == true && matchConfPassword() == true){
		return true;
	}
	return false;
	
}

/* validate email id */
function validateEmailId(){
	return true;
}
/* validate email id */

/* validate contact number */
function validateContactNumber(){
	let contact = document.getElementById("contact");
	
	if(contact.value.length == 10){
		
		/* check karo - contact.value - is number or not */
		let isNot_Number = isNaN(contact.value);
		
		if(isNot_Number == false){
			return true;
		}
		
		else{
			Swal.fire(
    		  'Dear User!',
    		  'Invalid Contact',
    		  'error'
    		)
			return false;
		}
		/* check karo - contact.value - is number or not */
		
	}
	else
		return false;
}
/* validate contact number */



/* validatePassword */
function validatePassword(){
	return true;
}
/* validatePassword */	
	
	
	
/* compare password and confirm password */
function matchConfPassword(){
	
	if(document.getElementById("confirm_password").value == document.getElementById("password").value){
		console.log("jbhjbjh");
		return true;
	}
	else{
		Swal.fire(
   		  'Dear User!',
   		  'Confirm Password, Not Matched',
   		  'error'
   		)
   		return false;
	}
}
/* compare password and confirm password */


/* sendAjaxRequest */
function sendAjaxRequest(url, method, dataType, info){
	$.ajax({
		  url : url,
		  method : method,
		  dataType : dataType,
		  data : info,
		  success: function(response) {
		   
			  
			console.log(response.source, " and ", response.result);
			
			/* agar response user_signup servlet se aaya hai... */
			if(response.source == "user_signup") {
				
				/* show a successfull signup message to user */
			    Swal.fire(
	    		  'Dear User!',
	    		  'Signup successfull',
	    		  'success'
	    		)
	    		/* show a successfull signup message to user */
				
			}
			/* agar response user_signup servlet se aaya hai... */
			
			/* agar response user_login servlet se aaya hai... */
			else if(response.source == "user_login") {
				
				/* ADMIN */
				if(response.result == "admin"){
					Swal.fire(
		    		  'Dear Admin!',
		    		  'Login successfull',
		    		  'success'
		    		)
		    		
				}
				/* ADMIN */
				
				/* USER */
				else if(response.result == "user"){
					Swal.fire(
		    		  'Dear User!',
		    		  'Login successfull',
		    		  'success'
		    		)
				}
				/* USER */
				
				/* doesn't exist */
				else if(response.result == "none"){
					Swal.fire(
		    		  'Dear User!',
		    		  'Login Failed',
		    		  'error'
		    		)
				}
				/* doesn't exist */

			}
			/* agar response user_login servlet se aaya hai... */
			

		  },
		  error: function(xhr, status, error) {
		    console.log('An error occurred index.jsp: ' + error);
		  }
	});

}
/* sendAjaxRequest */
</script>

</html>