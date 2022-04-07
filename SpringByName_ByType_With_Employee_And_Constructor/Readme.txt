For ByName = There will not be Exceptions , It will just show Null if the Address Doesn't Gets Autowire

for ByType = You Cannnot refer Two Address to one Object, 
it will give (Exception in thread "main" org.springframework.beans.factory.UnsatisfiedDependencyException)

But it will work fine If two pojo's i.e. for.ex. Student And Employee using same Address
And will give the Address for both Student and Employee 

Output:
BY Constructor:
Student{id=1, name='Gita', Address=Address{Street='link road', State='maha'}}
