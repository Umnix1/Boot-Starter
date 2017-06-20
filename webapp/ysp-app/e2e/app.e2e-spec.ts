import { YspAppPage } from './app.po';

describe('ysp-app App', () => {
  let page: YspAppPage;

  beforeEach(() => {
    page = new YspAppPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
