
# Recycler View
![App Screenshot](https://miro.medium.com/max/875/1*MfxnvyiEHAMPWMWS24MZdQ.png)
## What is RecyclerView?
RecyclerView is a powerful UI widget that allows you to display a list of data in a flexible manner

## Why we Should use RecyclerView instead of ListView?

When a list scrolls, only a handful of views are actually displayed on the screen. When a view scrolls off screen, RecyclerView reuses it and fills it with new data. This makes your app more efficient both in time and space, because it recycles existing structures instead of constantly creating new ones.
![App Screenshot](https://miro.medium.com/max/540/1*9vi67lL4-WNu22zyf_qAYw.png)

### Adapter
It is a subtype of RecyclerView.Adapter class. It takes the data set which has to be displayed to the user in RecyclerView. It is like the main responsible class to bind the views and display it.

### onCreateViewHolder()
 only creates a new view holder when there are no existing view holders which the RecyclerView can reuse

### ViewHolder
it stores the views so onBindViewHolder() can use it

### onBindViewHolder()
it is the place to fill the view with specific data for view.


