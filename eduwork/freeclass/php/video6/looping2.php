<!-- Mengulangi -->

<?php

    // deklarasi
    $no;
    $nama;
    $kelas;

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Looping</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

    <br><br><br>

    <center>
    
    <div class="container">
        <table>
            <tr>
                <th>No.</th>
                <th>Nama</th>
                <th>Kelas</th>
            </tr>
            <tr>
                <td>
                    <?php 
                        for ($no = 1; $no <= 10; $no++) { 
                            echo "$no <br>";
                        }
                    ?>
                </td>
                <td>
                    <?php 
                        for ($nama = 1; $nama <= 10; $nama++) { 
                            echo "Nama ke $nama <br>";
                        }
                    ?>
                </td>
                <td>
                    <?php 
                        for ($kelas = 10; $kelas >= 1; $kelas--) { 
                            echo "Kelas ke $kelas <br>";
                        }
                    ?>
                </td>
            </tr>
        </table>
    </div>

    </center>

</body>
</html>






