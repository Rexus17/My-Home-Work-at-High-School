<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Product</title>
    <link rel="stylesheet" href="aset/css/bootstrap.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <!--link css-->
    <link rel="stylesheet" type="text/css" href="css/style.css">

  </head>
  <body>

      <!--awal navbar-->
      <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
          <a class="navbar-brand" href="home.php">
          <img src="Gambar/brand.png" alt="" width="50" height="50" class="ne-2">
          Queen <strong>Store</strong></a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNav">
          <form class="d-flex ms-auto my-4 my-lg-0">
            <input class="form-control me-2" type="search" placeholder="Cari Barang Anda" aria-label="Search">
            <button class="btn btn-warning" type="submit">search</button>
          </form>
            <ul class="navbar-nav ms-auto">
              <li class="nav-item">
                <a class="nav-link" href="home.php">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="product.php">Product</a>
              </li>
              <!-- <li class="nav-item">
                <a class="nav-link" href="#">Bantuan</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Daftar</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Masuk</a> -->
              </li>
              <!--Akhir navbar--> 
              
            </ul>
          </div>
        </div>
      </nav>
      <!-- akhir navbar -->

    <br>

    <center>
      <h1> Welcome To Product</h1>
    </center>

    <br>

      <div class="container d-flex justify-content-center mt-3 img-fluid">
        <div class="row">
          <div class="col">
            <div class="card" style="width: 18rem;">
              <img src="Gambar/sweater3.jpg" class="card-img-top" alt="...">
              <div class="card-body">
                <h5 class="card-title">Sweater Girl</h5>
                <!-- <p class="card-text">Rp.150.000</p> -->
                <a href="detail.php" class="btn btn-primary">Lihat Detail</a>
              </div>
            </div>
          </div>
        </div>
      </div>


<script src="aset/js/bootstrap.bundle.js"></script>
  </body>
</html>
