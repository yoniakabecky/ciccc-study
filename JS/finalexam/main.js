// tab
function openTab(elem, page) {
  let tabContent = document.getElementsByClassName("tabContent");
  let tabLink = document.getElementsByClassName("tabLink");

  for (let i = 0; i < tabContent.length; i++) {
    tabContent[i].style.display = "none";
    elem.style.backgroundColor = "#ccc";
  }
  for (i = 0; i < tabLink.length; i++) {
    tabLink[i].className = tabLink[i].className.replace(" active", "");
    tabLink[i].style.backgroundColor = "";
    elem.style.backgroundColor = "#ccc";
  }

  document.getElementById(page).style.display = "block";
  event.currentTarget.className += " active";
}


const myForm = document.myForm;
const fNameDiv = document.getElementById("fNameDiv");
const lNameDiv = document.getElementById("lNameDiv");
const emailDiv = document.getElementById("emailDiv");
const cityDiv = document.getElementById("cityDiv");
const ZipDiv = document.getElementById("ZipDiv");
const usernameDiv = document.getElementById("usernameDiv");
const meter = document.getElementById("meter");
const passwordDiv = document.getElementById('passwordDiv');
const confirmPassDiv = document.getElementById("confirmPassDiv");
const validateDiv = document.getElementById("validateDiv");


// Form validation
function validate() {

  if (myForm.fName.value === "") {
    fNameDiv.innerHTML = "Please provide a valid First Name";
    myForm.fName.focus();
    return false;
  } else {
    fNameDiv.innerHTML = "";
  }

  if (myForm.lName.value === "") {
    lNameDiv.innerHTML = "Please provide a valid Last Name";
    myForm.lName.focus();
    return false;
  } else {
    lNameDiv.innerHTML = "";
  }

  if (myForm.email.value === "") {
    emailDiv.innerHTML = "Please provide a valid your email address";
    myForm.email.focus();
    return false;
  } else if (validateEmail()) {
    emailDiv.innerHTML = "Please enter a correct email address";
    myForm.email.focus();
    return false;
  } else {
    emailDiv.innerHTML = "";
  }

  function validateEmail() {
    let atPosition = myForm.email.value.indexOf("@");
    let dotPosition = myForm.email.value.indexOf(".");

    return !(atPosition < 1 || (dotPosition - atPosition < 2));
  }

  if (myForm.City.value === "") {
    cityDiv.innerHTML = "Please provide your city name";
    myForm.City.focus();
    return false;
  } else {
    cityDiv.innerHTML = "";
  }

  if (myForm.Zip.value === "" || isNaN(myForm.Zip.value) || myForm.Zip.value.length != 5) {
    ZipDiv.innerHTML = "Please provide a zip in the format #####";
    myForm.Zip.focus();
    return false;
  } else {
    ZipDiv.innerHTML = "";
  }

  if (myForm.Username.value == "" || myForm.Username.value.length <= 6 || !isNaN(myForm.Username.value)) {
    usernameDiv.innerHTML = "Please provide your Username!";
    document.myForm.Username.focus();
    return false;
  } else {
    usernameDiv.innerHTML = "";
  }

  if (myForm.ConfirmPassword.value !== myForm.Password.value) {
    confirmPassDiv.innerHTML = "Please enter same password";
    document.myForm.ConfirmPassword.focus();
    return false;
  } else {
    confirmPassDiv.innerHTML = "";
  }

  validateDiv.innerHTML = "OK";
  return (true);

}


//Password
myForm.Password.addEventListener("keyup", () => {
  checkPassword(myForm.Password.value);
});

function checkPassword(password) {
  passwordDiv.innerHTML = "";
  let strength = 0;

  // if (password.match(/[a-z]+/)) {
  //   strength += 1;
  // }
  if (password.match(/[A-Z]+/)) {
    strength += 1;
  }
  if (password.match(/[0-9]+/)) {
    strength += 1;
  }
  if (password.match(/[$@#&!]+/)) {
    strength += 1;
  }

  if (password.length < 8) {
    passwordDiv.innerHTML = "minimum number of characters is 8";
  }

  if (password.length > 20) {
    passwordDiv.innerHTML = "maximum number of characters is 20";
  }

  switch (strength) {
    case 0:
      meter.value = 0;
      break;

    case 1:
      meter.value = 25;
      break;

    case 2:
      meter.value = 50;
      break;

    case 3:
      meter.value = 75;
      break;

    case 4:
      meter.value = 100;
      break;
  }
}
