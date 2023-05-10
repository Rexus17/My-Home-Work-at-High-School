<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link rel="stylesheet" href="aset/css/bootstrap.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <!--Link css-->
    <link rel="stylesheet" type="text/css" href="css/style.css">

    <!--link font-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    
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
            <input class="form-control me-2" type="search" placeholder="Search Your Need!" aria-label="Search">
            <button class="btn btn-warning" type="submit">search</button>
          </form>
            <ul class="navbar-nav ms-auto">
              <li class="nav-item">
                <a class="nav-link ne-4" href="home.php">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link ne-4 active" aria-current="page" href="product.php">Product</a>
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



    <!-- jumbotron -->
    <div class="jumbotron text-center">
      <img src="gambar/icon-home.png" class="img-circle" alt="">
      <h1>Queen Store</h1>
      <p>Friendly | Comfortable | Durable</p>
    </div>
    <!-- akhir jumbotron -->

    <br>

    <center>

    <!-- sapa -->
    <section class="about" id="about">
      <div class="container">
        <div class="row">
          <div class="col-sm-12">
            <h2 class="text-center">Welcome to Queen Store</h2>
            <hr>
          </div>
        </div>
        <div class="row">
          <div class="col-sm-6 col-sm-offset-1">
            <p class="pKiri">Lorem ipsum, dolor sit amet consectetur adipisicing, elit. Quaerat reprehenderit et, tempore iure sequi perspiciatis inventore nobis placeat earum asperiores non tempora dignissimos aliquid cumque alias error, itaque vero deserunt!</p>
          </div>      
          <div class="col-sm-6">
            <p class="pKanan">Lorem, ipsum dolor sit amet, consectetur adipisicing elit. Odit accusamus at nesciunt doloremque, voluptatibus voluptates suscipit, similique exercitationem, possimus aperiam quos laboriosam placeat dolores? Quidem, inventore sed obcaecati. Sunt, provident.</p>
          </div>          
        </div>
      </div>
    </section>
    <!-- akhir sapa -->

    <!-- portfolio -->
    <section class="portfolio" id="portfolio">
      <div class="container">
        <div class="row">
          <div class="col-sm-12 text-center">
            <h2>Portfolio</h2>
            <hr>
          </div>
        </div>

        <div class="row">

          <div class="col-sm-4">
            <a href="" class="thumbnail">
              <img src="img/portfolio/img1.jpg" alt="">
            </a>
          </div>

          <div class="col-sm-4">
              <a href="" class="thumbnail">
                <img src="img/portfolio/img2.jpg" alt="">
              </a>
          </div>

          <div class="col-sm-4">
              <a href="" class="thumbnail">
                <img src="img/portfolio/img3.jpg" alt="">
              </a>
          </div>

          <div class="col-sm-4">
              <a href="" class="thumbnail">
                <img src="img/portfolio/img4.jpg" alt="">
              </a>
          </div>

          <div class="col-sm-4">
              <a href="" class="thumbnail">
                <img src="img/portfolio/img5.jpg" alt="">
              </a>
          </div>

          <div class="col-sm-4">
              <a href="" class="thumbnail">
                <img src="img/portfolio/img6.jpg" alt="">
              </a>
          </div>

        </div>
      </div>
    </section>
    <!-- akhir portfolio -->

    </center>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery-3.6.0.min.js"></script>
    <script src="js/jquery.easing.1.3.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>

    <script src="js/script.js"></script>
       
       
</body>
</html>