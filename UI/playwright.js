const { chromium } = require('playwright');

(async () => {
  const browser = await chromium.launch();
  const page = await browser.newPage();

  await page.goto('https://www.example.com/login');

  await page.getByRole((textbox), { name: 'Username' }).fill('admin');
  await page.getByRole((textbox), { name: 'Password' }).fill('password123');
  await page.getByRole((button), { name: 'Login' }).click();

  await page.waitForSelector('dashboard');

  await browser.close();
})();
