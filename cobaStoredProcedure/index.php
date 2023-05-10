<?php

// konfigurasi untuk koneksi ke database
$connect = mysqli_connect("localhost", "root", "", "country");

// untuk proses insert
if (isset($_POST["btn_add"])) {
    // echo 'OK!';
    // die;
    // memanggil stored procedure di database dengan nama "insertCountry()"
    $insertSql = "CALL insertCountry('" . $_POST["country_name"] . "')";
    // jika berhasil, maka masukan data dari inputan user
    if (mysqli_query($connect, $insertSql)) {
        echo
        "<script>
            alert('New Country Success to Add!')
            document.location.href = 'index.php';
        </script>";
        header("location:index.php?inserted=1");
    } else {
        echo
        "<script>
            alert('New Country Fail to Add!')
            document.location.href = 'index.php';
        </script>";
    }
}

?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Membuat CRUD dengan stored procedure di PHP dan MYSQL</title>
    <!-- connect ke bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- berikan style pada halaman ini -->
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        .box {
            width: 500px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
    </style>
</head>

<body>

    <div class="container box my-5">
        <form action="" method="POST" name="add_country0">
            <h3 class="text-center">Input Data Negara</h3>
            <div class="form-group">
                <input type="text" class="form-control" name="country_name" autofocus>
            </div>
            <div class="form-group">
                <input type="submit" class="form-control bg-info text-white font-weight-bold" name="btn_add" value="ADD">
            </div>
        </form>
        <div class="table-responsive">
            <table class="table table-striped">
                <tr>
                    <th>Country Name</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
                <?php

                // memanggil stored procedure di database dengan nama "selectSql()"
                $selectSql = "CALL selectCountry()";
                // masukna "selectSql()" ke dalam variabel "$selectResult"
                $selectResult = mysqli_query($connect, $selectSql);
                // jika data ditemukan, maka jalankan control programming "IF"
                if (mysqli_num_rows($selectResult) > 0) {
                    while ($row = mysqli_fetch_array($selectResult)) {

                ?>
                        <tr>
                            <td><?= $row["country_name"]; ?></td>
                            <td><a href="index.php?edit=1&id_country=<?= $row["id_country"]; ?>">Edit</a></td>
                            <td><a href="" class="btn_delete" id="<?= $row["id_country"]; ?>">Delete</a></td>
                        </tr>
                    <?php

                    }
                    // jika data tidak ditemukan, maka jalankan control programming "ELSE"
                } else {

                    ?>
                    <tr>
                        <td colspan="3">No Data</td>
                    </tr>
                <?php

                }

                ?>

            </table>
        </div>
    </div>

    <!-- optional JavaSript -->
    <!-- link untuk connecting -->
    <!-- JQuery first, then Pooper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</body>

</html>