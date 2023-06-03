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