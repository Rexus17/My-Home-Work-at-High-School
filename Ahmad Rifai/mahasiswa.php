<!DOCTYPE html>
<html>
<head>
    <title>PPDB SMK TUNAS MEDIA</title>
    <style type="text/css">
        body {
            background-image: url(bahan/concrete-texture.png);
        }

        .form-group {
            margin-bottom: .7rem;
        }
        .form-group {
            display: block;
            margin-bottom: .2rem;
        }

        table {
            margin-top: 2.5rem;
        } 

        table thead {
            border-collapse: collapse;
            background-color: purple;
            color: white;
        }

        .form-radio {
            display: flex;
        }

        .form-radio .radio-item {
            display: flex;
            margin-right: .1rem ;
        }
    </style>
</head>
<body>
    <form method="post">
        <fieldset>
            <legend>FORM PPDB</legend>

            <div class="form-group">
                <label>NIS Siswa : </label>
                <input type="number" placeholder="Nis Siswa" name="nis">
            </div><br>


            <div class="form-group">
                <label>Nama Siswa : </label>
                <input type="text" placeholder="Nama Siswa" name="nama">
            </div><br>


            <div class="form-group">
                <label>Asal Sekolah : </label>
                <input type="text" placeholder="Asal Sekolah" name="sekolah">
            </div><br>

            <div class="form-group">
                <label>Alamat : </label>
                <input type="text" placeholder="Alamat" name="alamat">
            </div><br>

            <div class="form-group">
                <label>Tanggal Lahir : </label>
                <input type="date" placeholder="Tanggal Lahir" name="tgl">
            </div><br>


            <div class="form-group">
                <label>Telepon : </label>
                <input type="number" placeholder="Telepone" name="tlp">
            </div><br>


            <div class="form-group">
                <label>Jurusan : </label>
                <select name="jurusan">
                    <option value="" disabled="" selected="Silahkan Pilih Jurusan">Silahkan Pilih Jurusan</option>
                    <option value="Rekayasa Perangkat Lunak">Rekayasa Perangkat Lunak</option>
                    <option value="Multimedia">Multimedia</option>
                    <option value="OTKP">OTKP</option>
                </select>
            </div><br>


            <div class="form-group">
                <label>Jenis Kelamin : </label>
                <div class="form-radio">
                    <div class="radio-item">
                        <input type="radio" id="Jenis Kelamin1" name="Jenis_Kelamin" value="laki-laki">
                        <label for="Jenis Kelamin1">Laki - Laki</label>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <div class="form-radio">
                    <div class="radio-item">
                        <input type="radio" id="Jenis Kelamin2" name="Jenis_Kelamin" value="Perempuan">
                        <label for="perempuan">Perempuan</label>
                    </div>
                </div>
            </div><br>

            <div class="form-group">
                <button name="submit">Submit</button> <br>
            </div>

        </div>

    </form>

    <br>

    <table border="2" cellpadding="8">
        <thead>
            <tr>
                <th>NIS SISWA</th>
                <th>Nama Siswa</th>
                <th>Asal Sekolah</th>
                <th>Alamat</th>
                <th>Tanggal Lahir</th>
                <th>Telepon</th>
                <th>Jurusan</th>
                <th>Jenis Kelamin</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><?= !empty($_POST['nis']) ? $_POST['nis'] : '' ?></td>
                <td><?= !empty($_POST['nama']) ? $_POST['nama'] : '' ?></td>
                <td><?= !empty($_POST['sekolah']) ? $_POST ['sekolah'] : '' ?></td>
                <td><?= !empty($_POST['alamat']) ? $_POST ['alamat'] : '' ?></td>
                <td><?= !empty($_POST['tgl']) ? $_POST ['tgl'] : '' ?></td>
                <td><?= !empty($_POST['tlp']) ? $_POST ['tlp'] :'' ?></td>
                <td><?= !empty($_POST['jurusan']) ? $_POST['jurusan'] : '' ?></td>
                <td><?= !empty($_POST['Jenis_Kelamin']) ? $_POST ['Jenis_Kelamin'] : '' ?></td>

            </tr>
        </tbody>
</body>
</html>



