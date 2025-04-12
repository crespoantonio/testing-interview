from playwright.sync_api import sync_playwright

def run():
    with sync_playwright() as p:
        browser = p.chromium.launch()
        page = browser.new_page()

        page.goto("www.example.com/login")  

        page.locator("usename").fill("admin")  
        page.locator("password").fill("password123")
        page.locator("loginButton").click()

        page.wait_for_selector("dashbord")

        browser.close()

run()
