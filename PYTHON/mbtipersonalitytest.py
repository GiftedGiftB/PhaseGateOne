print("""
			MBTI Personality Test

""")

def main():
	judging_perceiving = get_judging_perceiving()
	extraversion_introversion = get_extraversion_introversion()
	thinking_feeling = get_thinking_feeling()
	#sensing_intuition = get_sensing_intuition()
	#personality_type = sensing_intuition + extraversion_introversion + thinking_feeling + judging_perceiving
	#print("\nYour personality type is:", personality_type)

	def get_judging_perceiving():
		print("\nWhen working on a project, what motivates you more?")
		print("A. Breaking down the task into smaller, manageable parts and creating a schedule.")
		print("B. Brainstorming new ideas and exploring different possibilities.")
		choice = input("\nEnter your choice (A/B): ").upper()
		if choice == "A":
			return "J" 
		else:
		
			def get_extraversion_introversion():
				print("\nIn social situations, how do you typically feel?")
				print("A. Energized and enthusiastic, enjoying the company of others.")
				print("B. Reserved and reflective, preferring to observe before contributing.")
				choice = input("\nEnter your choice (A/B): ").upper()
				if choice == "A":
					return "E"
				else:
					return "I"
			def get_thinking_feeling():
				print("\nWhen making decisions, what do you prioritize?")
				print("A. Logical analysis and objective criteria.")
				print("B. Personal values and the impact on others.")
				choice = input("\nEnter your choice (A/B): ").upper()
				if choice == "A":
					return "T"
				else:
					return "F"
