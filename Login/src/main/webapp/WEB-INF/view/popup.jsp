<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pop-up Saat Klik Student ID</title>
  <style>
    /* Gaya untuk pop-up */
    .popup {
      display: none;
      position: fixed;
      top: 50%;
      left: 50%;
      transform: translate(-50%, -50%);
      padding: 20px;
      background-color: white;
      border: 1px solid #ccc;
      box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.1);
      z-index: 1000;
    }
  </style>
</head>
<body>
<!-- Pop-up -->
<div class="popup" id="popup">
  <p>Ini adalah isi dari pop-up.</p>
  <button onclick="closePopup()">Tutup</button>
</div>

<script>
  // Fungsi untuk menampilkan pop-up
  function showPopup() {
    document.getElementById("popup").style.display = "block";
  }

  // Fungsi untuk menutup pop-up
  function closePopup() {
    document.getElementById("popup").style.display = "none";
  }

  // Menghubungkan fungsi dengan elemen yang dapat diklik
  document.querySelector(".id").addEventListener("click", showPopup);
</script>
</body>
</html>