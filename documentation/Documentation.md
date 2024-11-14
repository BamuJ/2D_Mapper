# 2D Mapping Library

This library was made to aid in 2D mapping a building or an area based on the routes people use. This helps to make a 2D view of an area as well as it's elevation this makes a map in more or less 3D space that makes it easy to find places that would otherwise be hard to make out on a map even with directions included.

The library is composed of four classes:

1. Point Class
2. Route Class
3. Test Class
4. Tests Class
5. ConnectingLine
6. RouteManager

The **Point** Class is to capture the longitude and latitude of the position captured by GPS to capture the point in the route.

The **Route** Class is to capture the route used by people and return them for the user to make it better or filter the data nicely.

The **Test** Class is used to create a test that will be used to know the viability of the project.

The **Tests** Class is used to handle all tests and report on the number of tests passed or failed and also guide the development of the project.

The **RouteManager** Class is used to manage all the routes in the system. It used the ID to uniquely identify routes as well as delete and search for them. It also has functions to obtain the number of routes present and this can even be vital in filtering routes.

The **Connecting** Line Class is used to manage the connecting lines between two points. It connects two points with a virtual line that can allow us offer directions using an arrow of sorts to direct the user to the route they aim to take. This is one of the features that can be built in the future iterations.

Usage