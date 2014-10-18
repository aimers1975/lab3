def largest(mylist):
    if len(mylist) == 0:
      raise ValueError("Cannot call largest on empty list")
  # max = -sys.maxint # "smallest" possible int
  thismax = mylist[0]
  for index in range(len(mylist)):
      if mylist[index] > thismax:
        thismax = mylist[index]
  return thismax
