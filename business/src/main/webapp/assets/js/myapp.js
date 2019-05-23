$(function() {
	
	// Solving active navbar issue
	switch(menu)
	{
	case'Home':
		$('#home').addclass('active');
		break;
	case'About Us':
		$('#about').addclass('active');
		break;
	case'Contact Us':
		$('#contact').addclass('active');
		break; 
	
	}

})