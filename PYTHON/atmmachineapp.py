def create_account():
	first_name = input("Enter account number: ")
	last_name = input("Enter name: ")
	user_pin = int(input("Enter pin: "))

def deposit():
	amount = float(input("Enter amount deposit amount: "))
	if amount < 0:
		print("invalid amount")
	else:
		return amount

def withdraw():
	amount1 = float(input("Enter withdrawal amount: "))
	if amount < 0:
		print("invalid withdraw amount")
	else:
		return amount

def show_balance():
	print(f"your balance is ${balance:.2f}")

def transfer():
	recipiantNumber = int(input("Enter the recipiant account number: "))
#not done yet

balance = 0
is_running = True

while is_running:
	print("""
1. Create account
2. Close account
3. Deposit money
4. Withdraw money
5. Check accout balance
6. Tranfer from one account to another
7. Change pin
""")
	userNumber = int(input("Enter a number from 1 - 4: "))
	match userNumber:
		case 1:
			create_account()
		case 2:
			is_running = False
		case 3: 
			balance += deposit()
		case 4: 
			balance -= withdraw()
		case 5:
			show_balance()	
		case 6:
			transfer()
		case 7:

		case _:
			print("invalid.")
print("Goodbye")

