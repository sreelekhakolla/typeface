def solve(n):
      sig= '-' if n<0 else ''
      n = abs(n)
      if n < 3:
         return str(n)
      s = ''
      while n != 0:
         s = str(n%3) + s
         n = n//3
      return sig+s
nn=int(input())
print(solve(nn))
