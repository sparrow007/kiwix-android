package org.kiwix.kiwixmobile.data;

import org.kiwix.kiwixmobile.data.local.entity.History;
import org.kiwix.kiwixmobile.library.entity.LibraryNetworkEntity;
import org.kiwix.kiwixmobile.models.Language;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

/**
 * Defines the set of methods which are required to provide the presenter with the requisite data.
 */

public interface DataSource {
  Single<List<LibraryNetworkEntity.Book>> getLanguageCategorizedBooks();

  void saveBooks(List<LibraryNetworkEntity.Book> book);

  Completable saveLanguages(List<Language> languages);

  Single<List<History>> getDateCategorizedHistory(boolean showHistoryCurrentBook);

  void saveHistory(String file, String favicon, String url, String title, long timeStamp);
}
