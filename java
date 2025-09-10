document.addEventListener("DOMContentLoaded", function() {
  const links = document.querySelectorAll("a:not([target='_blank'])");

  links.forEach(link => {
    link.addEventListener("click", function(e) {
      const href = link.getAttribute("href");
      if (href.startsWith("#") || href === "" || href.startsWith("mailto:")) return;

      e.preventDefault();
      document.getElementById("page-wrapper").classList.add("fade-leave-active");

      setTimeout(() => {
        window.location.href = href;
      }, 400); // Match CSS fade transition
    });
  });
});
