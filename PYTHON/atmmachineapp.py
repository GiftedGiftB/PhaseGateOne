
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

def transfer_to_other_bank():
	recipiantNumber = int(input("Enter the recipiant account number: "))
#not done yet
def change_pin():
	user_pin = int(input("Enter pin: "))
	if user_pin != 0 or user_pin > 7:
		print("invalid pin")
balance = 0
is_running = True

while is_running:
	print("""
1. Create account
2. Close account
3. Deposit money
4. Withdraw money
5. Check account balance
6. Tranfer from one account to another
7. Change pin
8. Exit
""")
	userNumber = int(input("Enter a number from 1 - 4: "))
	match userNumber:
		case 1:
			create_account()
		case 2:

		case 3: 
			balance += deposit()
		case 4: 
			balance -= withdraw()
		case 5:
			show_balance()	
		case 6:
			transfer()
		case 7:
			change_pin():
		case 8:
			is_running = False
		case _:
			print("invalid.")
print("Goodbye")

