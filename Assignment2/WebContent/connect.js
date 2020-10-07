$(document).ready(function () {
	$("#Submit").click(function () {
	//Get page contents and create an empty array
	var page_contents=$("#myForm").serializeArray(),
		page_contents_data={};
	
	//Store the page_contents inside our page_contents_data 
	//Array, where the index(position) of the array is the actual JSP field name
	$(page_contents).each(function (position,field){
		page_contents_data[field.name]=field.value;
		
		});
	//alert(page_contents_data['day'] + page_contents_data['month']+page_contents_data['year']+page_contents_data['current_year']+page_contents_data['current_month']+page_contents_data['current_day'])
	
	
	$("#myForm").on('submit',function(e){
		$.post('http://localhost:8080/Assignment2/Servlet',
				//Sending function/Data package
				{
					//variable for the server:variable from the JS/JSP
					server_variable_binary:page_contents_data['Binary'],
				},
				//Return function
		function (data,status){	
					var responses=data.split("/");
					$('#response').text(responses[0]);
					$('#response2').text(responses[1]);
		}).error(function(){
				
			});
			e.preventDefault();
		});
	});
});
