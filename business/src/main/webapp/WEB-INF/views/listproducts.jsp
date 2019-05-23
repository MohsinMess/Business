<div class="container">

	<div class="row">

		<!-- Sidebar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>

		<!-- Display product -->
		<div class="col-md-9">

			<!-- Breadcrumb -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userclickallproducts == true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">All Products</li>


						</ol>
					</c:if>

					<c:if test="${userclickcategoryproducts==true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item">Category</li>
							<li class="breadcrumb-item active">${category.name}</li>


						</ol>
					</c:if>
				</div>
				

			</div>
			

		</div>


	</div>


</div>