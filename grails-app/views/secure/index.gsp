<!DOCTYPE html>
<html>
        <head>
           <meta name="layout" content="main"/>
        </head>
	
        <body>

            <!-- Fixed navbar -->
            <div class="navbar navbar-default navbar-fixed-top" role="navigation">
              <div class="container">
                <div class="navbar-header">
                  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                  </button>
                  <a class="navbar-brand" href="#">Mon CRM</a>
                </div>
                <div class="collapse navbar-collapse">
                  <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#about">About</a></li>
                    <li><a href="#contact">Contact</a></li>
                    <li class="dropdown">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <span class="caret"></span></a>
                      <ul class="dropdown-menu" role="menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li class="divider"></li>
                        <li class="dropdown-header">Nav header</li>
                        <li><a href="#">Separated link</a></li>
                        <li><a href="#">One more separated link</a></li>
                      </ul>
                    </li>
                  </ul>
                </div><!--/.nav-collapse -->
              </div>
            </div>

            <!-- Begin page content -->
            <div class="container">
              <div class="page-header">
                <h1>Sticky footer with fixed navbar</h1>
              </div>
              <p class="lead">Pin a fixed-height footer to the bottom of the viewport in desktop browsers with this custom HTML and CSS. A fixed navbar has been added with <code>padding-top: 60px;</code> on the <code>body > .container</code>.</p>
              <p>Back to <a href="../sticky-footer">the default sticky footer</a> minus the navbar.</p>
              
              <table class="table table-hover">
                  <thead>
                      <tr>
                        <th>ID</th>
                        <th>Nom</th>
                        <th>Prénom</th>
                      </tr>
                  </thead>
                  <tbody>
                      <tr>
                        <td>123</td>
                        <td>Karl</td>
                        <td>Verger</td>
                      </tr>                  
                  </tbody>
              </table>
              
            </div>

            <!-- Begin footer -->
            <div class="footer">
              <div class="container">
                <p class="text-muted">Place sticky footer content here.</p>
              </div>
            </div>
		
	</body>
</html>