import subprocess

def run_command(cmd):
    subprocess.run(cmd, shell=True)  # นี่เป็นช่องโหว่ที่อาจถูกโจมตีด้วย Command Injection

run_command("ls -la")
