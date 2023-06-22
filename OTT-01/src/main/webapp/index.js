        // Get all sidebar icons
        const sideBarIcons = document.querySelectorAll(".sideBarIcon");
        const sideBar = document.getElementById("sideBar");

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

        /*open signup form after clicking on signupButton...*/
        function opensignupForm(){
            // create a div of full viewPort size...
            let container = document.createElement("div");
            container.classList.add("d-flex", "align-items-center", "justify-content-center", "flex-column");
            container.style.position = "absolute";
            container.style.top = "0";
            container.style.width = "100vw";
            container.style.height = "100vh";
            
            // crete a form... 
            let form = document.createElement("form");
            form.classList.add("p-4", "rounded", "shadow");
            form.style.backgroundColor = "rgb(255,255,255)";
            form.style.height = "60vh";
            form.style.width = "20vw";

            let heading = document.createElement("h3");
            heading.textContent = "SIGNUP";
            heading.classList.add("text-dark", "text-center", "mb-4");
            heading.style.fontWeight = "800";
            form.appendChild(heading);

            for(let i = 0 ; i < 3 ; i++) {

                // label ...
                let label = document.createElement("label");
                label.setAttribute("for", "formGroupExampleInput");
                label.classList.add("form-label");
                label.style.marginLeft = "13px";
                label.style.fontFamily = 'Comfortaa', 'cursive';
                label.style.fontSize = "12px";
                if(i === 0)
                    label.textContent = "Email";
                else if(i === 1)
                    label.textContent = "Contact number";
                else if(i === 2)
                    label.textContent = "Username";

                // input tag ...
                let input = document.createElement("input");
                input.setAttribute("type", "text");
                input.classList.add("form-control", "border-bottom", "border-0", "mb-4");
                input.id = "formGroupExampleInput";
                input.style.borderBottomWidth = "4px";
                input.style.fontSize = "13px";
                input.style.fontFamily = 'Comfortaa', 'cursive';
                // <i class="fa-solid fa-user p-4 sideBarIcon"></i>
                
                let icon;

                if (i === 0) {

                    // icon 
                    icon = document.createElement("i");
                    icon.classList.add("fas", "fa-user", "p-4");
                    input.appendChild(icon);
                    input.placeholder = "Type email id";
                    

                } else if (i === 1) {

                    input.placeholder = "Type contact number";

                }
                else if (i === 2) {
                    input.placeholder = "Type username";
                }

               
                // div.appendChild(input);
                form.appendChild(label);
                form.appendChild(input);
                
            }

            // signup button 
            let loginButton = document.createElement("button");
            loginButton.classList.add("btn", "btn-outline-primary");
            loginButton.style.width = "97%";
            // loginButton.style.backgroundColor = "rgb(214,81,219)";
            loginButton.textContent = "SIGNUP";
            
            form.appendChild(loginButton);

            console.log(form);
            console.log(container);
           
            container.appendChild(form);
            document.body.appendChild(container);
            document.querySelector('input[placeholder="Type username"]').classList.add("mb-5");
        }

