print("""
		Menstral cycle App
""")

last_cycle_start_date = int(input("Enter last cycle start date (in days, e.g., 1-31): "))

current_cycle_start_date = int(input("Enter current cycle start date (in days, e.g., 1-31): "))

if last_cycle_start_date > current_cycle_start_date:
    temp = last_cycle_start_date
    last_cycle_start_date = current_cycle_start_date
    current_cycle_start_date = temp

cycle_length = current_cycle_start_date - last_cycle_start_date

ovulation_day = last_cycle_start_date + cycle_length // 2

print(f"The length of your cycle is: {cycle_length}")

print(f"Your ovulation day is approximately on day: {ovulation_day}")

safe_period_start = ovulation_day + 2
safe_period_end = last_cycle_start_date + cycle_length

print(f"Your safe period is approximately from day {safe_period_start} to day {safe_period_end}")