// Event Pada Saat Link Diklik
$('.page-scroll').on('click', function(Event) {
	// console.log('ok');
	
	// Ambil Isi href
	var tujuan = $(this).attr('href');
	// console.log(tujuan);

	// Tangkap Element YBS
	var elemenTujuan = $(tujuan);
	// console.log(elemenTujuan);
	// console.log(elemenTujuan.offset().top);
	// console.log($('html, body').scrollTop());			// Kok Tidak Bisa Jalan, Tambahkan html Sebelum body
						
	$('html, body').animate({								// ERROR Di Scroll Top, Tambahkan html Sebelum body
		scrollTop: elemenTujuan.offset().top - 50
	}, 1250, 'easeInOutExpo');

	Event.preventDefault();

});


// Parallax
// About
$(window).on('load', function() {
	$('.pKiri').addClass('pMuncul');
	$('.pKanan').addClass('pMuncul');
});



$(window).scroll(function () {
	var wScroll = $(this).scrollTop();

	// console.log(wScroll);
	// Jumbotron
	$('.jumbotron img').css({
		'transform' : 'translate(0px, '+ wScroll/4 +'%)'
	});

	$('.jumbotron h1').css({
		'transform' : 'translate(0px, '+ wScroll/2 +'%)'
	});

	$('.jumbotron p').css({
		'transform' : 'translate(0px, '+ wScroll/1.2 +'%)'
	});


	// Portfolio
	if ( wScroll > $('body, .portfolio').offset().top - 250 ) {			// ERROR Di Portfolio, offset
		$('body, .portfolio .thumbnail').each(function (i) {
			setTimeout(function () {
				$('body, .portfolio .thumbnail').eq(i).addClass('muncul');
			}, 300 * (i+1));
		});
	}
});








