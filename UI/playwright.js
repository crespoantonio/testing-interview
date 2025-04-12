const { chromium } = require('playwright');

(async () => {
  const browser = await chromium.launch();
  const page = await browser.newPage();

  await page.goto('www.example.com/login');

  await page.fill('usename', 'admin');
  await page.fill('password', 'password123');
  await page.click('loginButton');

  await page.waitForSelector('#dashbord');

  await browser.close();
})();
