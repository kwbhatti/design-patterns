Strategy Pattern 

in the example there are multiple strategies for door and floor. It also applies to room but we will ignore it for now

While building a room we can use any type of door or a room and apply its characteristics. 
We are able to do so by making all the concrete door classes implement door type.
This allows us to couple them together in a parameter value specially in the case of creating rooms.

